package programmers.level1;

public class WeirdWord {
	public String solution(String s) {
        String answer = "";
        s = s.toLowerCase();               // �� �ҹ��ڷ� ��ȯ
        String tmp[] = s.split(" ",-1);       // ���� �������� ������ tmp �迭�� ����
        for(int i = 0;i < tmp.length; i++) {
            String s2 = tmp[i];
            if(s2.equals(" ")) continue;
            for(int index = 0; index < s2.length(); index++) {
                if(index % 2 == 0) {
                    answer += (s2.charAt(index)+"").toUpperCase();   
                    continue;
                }
                else{
                    answer += (s2.charAt(index)+"").toLowerCase();
                }
            }
            answer += " ";
        }
        answer = answer.substring(0, answer.length()-1);
        return answer;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
