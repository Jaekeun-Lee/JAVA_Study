class StringArrayMultiple
{
	public static void main(String[] args) 
	{
		String [][] text = new String[9][9];

		for (int i = 0; i<text.length ;i++ )
		{
			System.out.println((i+1)+"���� ����մϴ�.");
			for (int j = 0; j<text[i].length ;j++ )
			{
				text[i][j] = String.valueOf((i+1)*(j+1));
				System.out.println( (i+1)+" * "+(j+1)+" = " + text[i][j]);
			}
			System.out.println("-------------------");
		}

	}
}
/*

1. length�� �迭�� ���̸� �˰��� �Ҷ� ���ȴ�.
2. length()�� ���ڿ��� ���̸� �˰��� �Ҷ� ���ȴ�.

 */