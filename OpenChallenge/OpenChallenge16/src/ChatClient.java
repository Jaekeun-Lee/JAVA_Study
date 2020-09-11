import java.awt.BorderLayout;
import java.awt.event.*;
import java.io.*;
import java.net.*;
import javax.swing.*;

public class ChatClient extends JFrame implements ActionListener {
	BufferedReader in = null;
	BufferedWriter out = null;
	Socket socket = null;
	Receiver serverMessage;
	JTextField clientMessage;
	JScrollPane spane;
	public ChatClient() {
		setTitle("Ŭ���̾�Ʈ ä�� â"); // ������ Ÿ��Ʋ
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //������ ���� ��ư(X)�� Ŭ���ϸ� ���α׷� ����
		setLayout(new BorderLayout()); //BorderLayout ��ġ�������� ���
		serverMessage = new Receiver(); // �������� ���� �޽����� ����� ���۳�Ʈ
		serverMessage.setEditable(false); // ���� �Ұ�
		Thread t = new Thread(serverMessage); // �������� �޽��� ������ ���� ������ ����
		clientMessage = new JTextField();
		clientMessage.addActionListener(this);
		spane = new JScrollPane(serverMessage); // �� �ؽ�Ʈ�� ����  ScrollPane���� ǥ��
		add(spane,BorderLayout.CENTER);
		add(clientMessage,BorderLayout.SOUTH);
		setSize(400, 200); // �� 400 �ȼ�, ���� 200 �ȼ��� ũ��� ������ ũ�� ����
		setVisible(true); // �������� ȭ�鿡 ��Ÿ������ ����
		try {
			setupConnection();
		} catch (IOException e) {
			handleError(e.getMessage());
		}
		t.start();
	}
	private void setupConnection() throws IOException {
		socket = new Socket("localhost", 9999); // Ŭ���̾�Ʈ ���� ����
		System.out.println("�����");
		in = new BufferedReader(new InputStreamReader(socket.getInputStream())); // Ŭ���̾�Ʈ�κ����� �Է� ��Ʈ��
		out = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream())); // Ŭ���̾�Ʈ���� ��� ��Ʈ��
	}
	public static void main(String[] args) {
		ChatClient frame = new ChatClient();
	}

	private static void handleError(String string) {
		System.out.println(string);
		System.exit(1);
	}
	
	private class Receiver extends JTextArea implements Runnable {
		@Override
		public void run() {
			String inputMessage=null;
			while (true) {
				try {
					inputMessage = in.readLine(); // Ŭ���̾�Ʈ���� �� ���� ���ڿ� ����
				} catch (IOException e) {
					handleError(e.getMessage());
				} 
				serverMessage.append("\n" + inputMessage);
				int pos = serverMessage.getText().length();
				serverMessage.setCaretPosition(pos); // caret �������� ���� ���������� �̵�
			}
		}
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == clientMessage) {
			String outputMessage = clientMessage.getText(); // �ؽ�Ʈ �ʵ忡�� ���ڿ� ����
			try {
				out.write("Ŭ���̾�Ʈ>" + outputMessage+"\n"); // ���ڿ� ����
				out.flush();
				serverMessage.append("\nŬ���̾�Ʈ>" + outputMessage);
				int pos = serverMessage.getText().length();
				serverMessage.setCaretPosition(pos); // caret �������� ���� ���������� �̵�
				clientMessage.setText(null); // �Է�â�� ���ڿ� ����
			} catch (IOException e1) {
				handleError(e1.getMessage());
			} 
		}
	}
}
