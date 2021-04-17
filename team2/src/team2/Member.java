package team2;

public class Member implements orders, Cart {

	public static void main(String[] args) {
		
	String[] name_a = {"김", "이", "박", "최", "정", "강", "조", "윤", "장", "임"}; //10
	String[] name_b = {"민준", "서준", "예준", "도윤", "시우", "주원", "하준", "지호", "지후", "준서", "준우", "현우", "도현", "지훈", "건우", "우진", "선우", "서진", "민재", "현준", "연우", "유준", "정우", "승우", "승현", "시윤", "준혁", "은우", "지환", "승민", "지우", "유찬", "윤우", "민성", "준영", "시후", "진우", "지원", "재윤", "시현", "동현", "수호", "태윤", "민규", "재원", "한결", "민우", "재민", "은찬"}; //50	
	String[] id = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z", "1", "2", "3", "4", "5", "6", "7", "8", "9", "0"}; //36
	String[] pw = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z", "1", "2", "3", "4", "5", "6", "7", "8", "9", "0", "!", "@", "#", "$", "%", "^", "&", "*"}; //44
	String[] gender = {" ", "남자", "여자"}; //2
	int age;
	String[] email = {"@naver.com", "@gmail.com", "@outlook.com", "@daum.net", "@nate.com", "@kakao.com"}; //6
	String[] address = {"서울", "부산", "인천", "대구", "대전", "광주", "울산", "수원", "창원", "성남", "고양", "용인", "청주", "안산", "전주", "안양", "천안", "포항", "화성", "김해", "부천", "남양주", "제주"}; //23
	String[] favorite = {"소설/시/희곡", "만화/라이트노벨", "IT모바일", "경제경영", "사회정치", "과학", "역사"}; //7
	String[] job = {"관리자", "전문가 및 관련 종사자", "사무 종사자", "서비스 종사자", "판매 종사자", "농림·어업 숙련 종사자", "기능원 및 관련 기능 종사자", "장치·기계 조작 및 조립 종사자", "단순노무 종사자", "학생", "군인"}; //11

	
for(int i=0; i<=1000; i++) {	
	double randomValue00 = Math.random(); //이름 성
	double randomValue01 = Math.random(); //이름 이름
	double randomValue02 = Math.random(); //아이디1
	double randomValue03 = Math.random(); //아이디2
	double randomValue04 = Math.random(); //아이디3
	double randomValue05 = Math.random(); //아이디4
	double randomValue06 = Math.random(); //아이디5
	double randomValue07 = Math.random(); //아이디6
	double randomValue08 = Math.random(); //아이디7
	double randomValue09 = Math.random(); //아이디8
	double randomValue10 = Math.random(); //비밀번호1
	double randomValue11 = Math.random(); //비밀번호2
	double randomValue12 = Math.random(); //비밀번호3
	double randomValue13 = Math.random(); //비밀번호4 (특수문자)
	double randomValue14 = Math.random(); //비밀번호5
	double randomValue15 = Math.random(); //비밀번호6
	double randomValue16 = Math.random(); //비밀번호7
	double randomValue17 = Math.random(); //비밀번호8
	double randomValue18 = Math.random(); //성별
	double randomValue19 = Math.random(); //나이
	double randomValue20 = Math.random(); //이메일
	double randomValue21 = Math.random(); //주소
	double randomValue22 = Math.random(); //좋아하는 장르
	double randomValue23 = Math.random(); //직업
	
	int random00 = (int)(randomValue00 * 9);		
	int random01 = (int)(randomValue01 * 49);
	int random02 = (int)(randomValue02 * 35);
	int random03 = (int)(randomValue03 * 35);
	int random04 = (int)(randomValue04 * 35);
	int random05 = (int)(randomValue05 * 35);
	int random06 = (int)(randomValue06 * 35);
	int random07 = (int)(randomValue07 * 35);
	int random08 = (int)(randomValue08 * 35);
	int random09 = (int)(randomValue09 * 35);
	int random10 = (int)(randomValue10 * 43);
	int random11 = (int)(randomValue11 * 43);
	int random12 = (int)(randomValue12 * 43);				
	int random13 = (int)(randomValue13 * 7) + 36;
	int random14 = (int)(randomValue14 * 43);
	int random15 = (int)(randomValue15 * 43);
	int random16 = (int)(randomValue16 * 43);
	int random17 = (int)(randomValue17 * 43);
	int random18 = (int)(randomValue18 * 2) + 1;
	int random19 = (int)(randomValue19 * 85) + 14;
	int random20 = (int)(randomValue20 * 5);
	int random21 = (int)(randomValue21 * 22);
	int random22 = (int)(randomValue22 * 6);
	int random23 = (int)(randomValue23 * 10);
	

		System.out.println("SET SCAN OFF");
		System.out.println("insert into Member values('"+name_a[random00]+name_b[random01]+"', '"+id[random02]+id[random03]+id[random04]+id[random05]+id[random06]+id[random07]+id[random08]+id[random09]+"', '"+pw[random10]+pw[random11]+pw[random12]+pw[random13]+pw[random14]+pw[random15]+pw[random16]+pw[random17]+"', '"+gender[random18]+"', '"+random19+"', '"+id[random02]+id[random03]+id[random04]+id[random05]+id[random06]+id[random07]+id[random08]+id[random09]+email[random20]+"', '"+address[random21]+"', '"+favorite[random22]+"', '"+job[random23]+"');");
		}
	}
}
