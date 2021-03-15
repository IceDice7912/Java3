package forMemberRandomCreate;

import java.util.Random;

public class Create {

	public static void main(String[] args) {
		
		String[] id = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z", "1", "2", "3", "4", "5", "6", "7", "8", "9", "0"}; //36개
		String[] pw = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z", "1", "2", "3", "4", "5", "6", "7", "8", "9", "0"}; //36개
		String[] name_a = {"김", "이", "박", "최", "정", "강", "조", "윤", "장", "임"}; //10개
		String[] name_b = {"민준", "서준", "예준", "도윤", "시우", "주원", "하준", "지호", "지후", "준서", "준우", "현우", "도현", "지훈", "건우", "우진", "선우", "서진", "민재", "현준", "연우", "유준", "정우", "승우", "승현", "시윤", "준혁", "은우", "지환", "승민", "지우", "유찬", "윤우", "민성", "준영", "시후", "진우", "지원", "재윤", "시현", "동현", "수호", "태윤", "민규", "재원", "한결", "민우", "재민", "은찬"}; //50명 입력함
		String[] sex= {" ", "남자", "여자"};
		
		for(int i=0; i<=500; i++) {
			double randomValue = Math.random();			
			double randomValue1 = Math.random();
			double randomValue2 = Math.random();
			double randomValue3 = Math.random();
			double randomValue4 = Math.random();
			double randomValue5 = Math.random();
			double randomValue6 = Math.random();
			double randomValue7 = Math.random();
			double randomValue8 = Math.random();
			double randomValue9 = Math.random();
			double randomValue10 = Math.random();
			double randomValue11 = Math.random();
			double randomValue12 = Math.random();
			double randomValue13 = Math.random();
			double randomValue14 = Math.random();
			double randomValue15 = Math.random();
			
			int randomID1 = (int)(randomValue1 * 35);
			int randomID2 = (int)(randomValue2 * 35);
			int randomID3 = (int)(randomValue3 * 35);
			int randomID4 = (int)(randomValue4 * 35);
			int randomID5 = (int)(randomValue5 * 35);
			int randomID6 = (int)(randomValue6 * 35);
			int randomID7 = (int)(randomValue7 * 35);
			int randomID8 = (int)(randomValue8 * 35);
			
			int randomPW1 = (int)(randomValue9 * 35);
			int randomPW2 = (int)(randomValue10 * 35);
			int randomPW3 = (int)(randomValue11 * 35);
			int randomPW4 = (int)(randomValue12 * 35);
			
			int randomNAME_A = (int)(randomValue13 * 9);
			int randomNAME_B = (int)(randomValue14 * 49);
						
			int randomSEX = (int)(randomValue15 * 2)+1;
			
			int randomAGE = (int)(randomValue * 100) + 1;			
			
			System.out.println("insert into member values('"+id[randomID1]+id[randomID2]+id[randomID3]+id[randomID4]+id[randomID5]+id[randomID6]+id[randomID7]+id[randomID8]+"', '"+pw[randomPW1]+pw[randomPW2]+pw[randomPW3]+pw[randomPW4]+"', '"+name_a[randomNAME_A]+name_b[randomNAME_B]+"', '"+sex[randomSEX]+"', "+randomAGE+");");
		}
		
	}

}
