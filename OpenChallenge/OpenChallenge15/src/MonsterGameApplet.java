import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.applet.*;
import java.net.URL;

public class MonsterGameApplet extends JApplet {
	JPanel gamePanel; // ���� �г�, ����Ʈ������ ����Ѵ�.
	AudioClip clip=null; // ������ ��� ���� ������ ���� ����� Ŭ�� ��ü
	
	public void init() {
		
		// �ƹ�Ÿ�� ������ ����� ���ڿ���, ����Ű, ������ ���ڴ� �ð� � ����  ����Ʈ ���� �����Ѵ�.
		String avatarChar="@";
		String monsterChar="M";
		long monsterDelay=200;
		
		try {
			avatarChar = getParameter("avatar");
			monsterChar =  getParameter("monster");
			monsterDelay = Integer.parseInt(getParameter("delay"));
		}catch(NumberFormatException e) {
			JOptionPane.showMessageDialog(null, "Format Error","<param> Number Format Error", 
					JOptionPane.ERROR_MESSAGE);
		}
	
		gamePanel = new GamePanel(avatarChar, monsterChar, 'q', monsterDelay);
		setContentPane(gamePanel); // GamePanel�� ����Ʈ������ ����Ѵ�.

		// ����� Ŭ���� �����Ѵ�.
		URL audioURL = getClass().getResource("wtc2-10f.mid");
		clip  = Applet.newAudioClip(audioURL);
	}
	
	public void start() {
		gamePanel.requestFocus(); // GamePanel�� Ű�� �Է¹��� �� �ֵ��� ��Ŀ���� �����Ѵ�.
		if(clip != null)
			clip.play(); // ����� ���ָ� �����Ѵ�.
	}
	
	public void stop() {
		if(clip != null)
			clip.stop(); // ����� ���ָ� �ߴ��Ѵ�.
	}
	
	public void destroy() {
		if(clip != null)
			clip.stop(); // ����� ���ָ� �ߴ��Ѵ�.
	}
}

// ������ ����Ǵ� �г�. ��ġ�����ڸ� null�� ����
class GamePanel extends JPanel {
	String avatarChar;
	String monsterChar;
	char quitChar; // �ǹ� ����.
	long monsterDelay;
	JLabel avatar;// �ƹ�Ÿ�� ���� ���̺�
	JLabel monster; // ������ ���� ���̺�
	final int AVATAR_MOVE = 10; // �ƹ�Ÿ�� �ѹ��� �����̴� �ȼ� ��

	public GamePanel(String avatarChar, String monsterChar, char quitChar, long monsterDelay) {
		this.avatarChar = avatarChar;
		this.monsterChar = monsterChar;
		this.quitChar = quitChar; // Ư���� �ǹ� ����
		this.monsterDelay = monsterDelay;
		
		// �ƹ�Ÿ�� ���� ���̺� ����
		avatar = new JLabel(avatarChar); 
		monster = new JLabel(monsterChar);
		
		setLayout(null); // ��Ÿ�� ���̺�� ���� ���̺��� ��ġ�� ������� ������ �� �ֵ��� null�� ����
		addKeyListener(new MyKeyListener()); // Ű ������ ���
		
		// �ƹ�Ÿ ���̺��� ��ġ�� ũ�� ���� �� �ҿ� ����
		avatar.setLocation(50,50);
		avatar.setSize(15,15);
		avatar.setForeground(Color.RED);
		add(avatar);
		
		// ���� ���̺��� ��ġ�� ũ�� ���� �� �ҿ� ����
		monster.setLocation(200,5);
		monster.setSize(15,15);
		add(monster);
		
		// ������ �����̴� ������ ���� �� ���� 
		MonsterThread th = new MonsterThread(monster, avatar, monsterDelay);
		th.start();

	}
	
	// GamePanel�� ��ϵ� Ű ������. ��, ��, ��, �� Ű�� ó���ϰ� ���� Ű ó������ ����
	class MyKeyListener extends KeyAdapter {
		public void keyPressed(KeyEvent e) {		
			int keyCode = e.getKeyCode(); // ��, ��, ��, �� Ű�� �����ڵ� Ű�� �ƴ�
			
			// Ű�� ���� �ƹ�Ÿ ���̺��� AVATAR_MOVE �ȼ� ��ŭ �����δ�.
			switch(keyCode) {
			case KeyEvent.VK_UP: 
				avatar.setLocation(avatar.getX(), avatar.getY()-AVATAR_MOVE); 
				break;
			case KeyEvent.VK_DOWN: 
				avatar.setLocation(avatar.getX(), avatar.getY()+AVATAR_MOVE); 
				break;
			case KeyEvent.VK_LEFT: 
				avatar.setLocation(avatar.getX()-AVATAR_MOVE, avatar.getY()); 
				break;
			case KeyEvent.VK_RIGHT: 
				avatar.setLocation(avatar.getX()+AVATAR_MOVE, avatar.getY()); 
				break;
			}
			
			avatar.getParent().repaint(); // �ƹ�Ÿ�� ��ġ�� ����Ǿ����Ƿ� �ٽ� �׸���
			// �ƹ�Ÿ�� �ִ� �гο��� ������ ��ġ�� �־��� �ƹ�Ÿ�� ������ �ϱ� ������ 
			// �ƹ�Ÿ�� �θ� �гο��� �ٽñ׸��⸦ ������
		}
	}
}

// ���� ���̺��� �����̴� 200ms �� 5 �ȼ��� �����̸鼭 ���Ӿ��� �ƹ�Ÿ�� �����ϴ� ������
// �����ڴ� �� ���� ���̺� ������Ʈ�� ���޹޴´�. ù��° from�� �ι�° to ���̺��� �����Ѵ�.
class MonsterThread extends Thread {
	JLabel from; // ���ư��� ���̺�. ���� ���̺�
	JLabel to; // �������� ���̺�. �ƹ�Ÿ ���̺�
	long monsterDelay;
	final int MONSTER_MOVE = 5; // from ���̺��� �ѹ��� �̵��ϴ� �Ÿ�
	
	MonsterThread(JLabel from, JLabel to, long monsterDelay) {
		this.from = from;
		this.to = to;
		this.monsterDelay = monsterDelay;
	}
	
	public void run() {
		int x=from.getX(),y=from.getY(); // ���� ������ ��ġ
		
		while(true) {
			if(to.getX() < from.getX()) // �ƹ�Ÿ�� ������ ������ �ִ� ��� 
				x = from.getX() - MONSTER_MOVE;
			else 						// �ƹ�Ÿ�� ������ �������� �ִ� ���
				x = from.getX() + MONSTER_MOVE;
			
			if(to.getY() < from.getY()) // �ƹ�Ÿ�� ������ ������ �ִ� ���
				y = from.getY() - MONSTER_MOVE;
			else 						// �ƹ�Ÿ�� ������ �Ʒ����� �ִ� ���
				y = from.getY() + MONSTER_MOVE;			
			
			// ������ ��ġ ����
			from.setLocation(x, y);
			
			// ������ ��ġ�� ����Ǿ��� ������ ������ �����ϴ� �г��� �ٽ� �׸����� ��
			from.getParent().repaint();
			
			// 200ms ���� ���� �ܴ�.
			try {
				sleep(monsterDelay);
			}catch(InterruptedException e) {
				return;
			}
		}
	}
}