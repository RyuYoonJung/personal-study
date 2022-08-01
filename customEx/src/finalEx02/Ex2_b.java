package finalEx02;

import java.util.Scanner;

public class Ex2_b {
	public static void main(String[] args) {
		// custom 예제

		// subject :: 변수의 선언과 초기화(할당)
		// summary :: 현재 연도와 DB상의 출생 연도를 이용해 현재 나이 구하기 (DB에 나이 data 누락되어 있는 경우)
		int year = 2022; // 현재 연도
		int yearOfBirth = 1994; // 출생 연도
		int age = 0; // 나이

		System.out.println("현재 연도 :: " + year);
		System.out.println("출생 연도 :: " + yearOfBirth);

		age = year - yearOfBirth; // 현재 연도 - 출생 연도 :: 만 나이
		age += 1; // 만 나이 + 1 = 현재 나이

		System.out.println("현재 나이 :: " + age);

		// subject :: 두 변수의 값 교환
		// summary :: 회원가입 시 암호화 된 password를 원본 password 로 변환하기
		int joinPw = 12345; // 회원 가입시 사용자가 설정한 password (가입즉시 암호화 됨)
		int EncryptionPw = 5461533; // 암호화 된 password (실제 DB에 저장되는 data)
		int originPw = 0; // 사용자가 설정한 원본 data 보관

		System.out.println("originPw :: " + originPw);
		System.out.println("joinPw :: " + joinPw);
		System.out.println("EncryptionPw :: " + EncryptionPw);

		originPw = joinPw;
		joinPw = EncryptionPw;
		EncryptionPw = originPw;

		System.out.println("originPw :: " + originPw);
		System.out.println("joinPw :: " + joinPw);
		System.out.println("EncryptionPw :: " + EncryptionPw);

		// subject :: 문자열 결합
		// summary :: 비밀번호 재설정 시 추천 password 생성
		String commonPw = "ccd"; // 추천 pw 조합 시, coolcode 사이트의 공통pw 요소
		char[] uniqueNum = new char[5]; // 추천 pw 조합 시, unique pw 요소
		for (int i = 0; i < uniqueNum.length; i++) {
			uniqueNum[i] = (char) (Math.random() * 127);
		}

		System.out.print("uniqueNum :: ");
		System.out.println(uniqueNum);

		System.out.print("추천 password :: ");
		System.out.print(commonPw);
		System.out.println(uniqueNum);

		// subject :: 형식화 된 출력 printf()
		// summary :: 개발자를 위한 application(1)_ 진법변환 출력 보조서비스
		byte c_b = 127;
		short c_s = 32767;
		int c_i = 2_100_000_000;
		long c_l = 9_100_000_000_000_000_000L;

		System.out.printf("(10진수 ::%4d) (2진수 :: %s) (8진수 :: %o) (16진수 :: %x)%n", c_b, Integer.toBinaryString(c_b), c_b,
				c_b);
		System.out.printf("(10진수 ::%4d) (2진수 :: %s) (8진수 :: %o) (16진수 :: %x)%n", c_b, Integer.toBinaryString(c_s), c_s,
				c_s);
		System.out.printf("(10진수 ::%4d) (2진수 :: %s) (8진수 :: %o) (16진수 :: %x)%n", c_b, Integer.toBinaryString(c_i), c_i,
				c_i);
		System.out.printf("(10진수 ::%4d) (2진수 :: %s) (8진수 :: %o) (16진수 :: %x)", c_b, Long.toBinaryString(c_l), c_l, c_l);
		System.out.println();

		// subject :: 화면에서 입력받기 Scanner
		// summary :: 회원 로그인 서비스 (DB에 저장된 계정과 다를 경우 로그인 불가)
		String nickname = "자바사랑";

		outerloop: while (true) {
			System.out.println("아이디를 입력하세요 > ");
			Scanner scanner = new Scanner(System.in);
			String inputId = scanner.nextLine();
			String loginId = inputId;
			String dbId = "ccdUser1";

			if (loginId.equals(dbId)) {
				System.out.println("비밀번호를 입력하세요 > ");
				String inputPw = scanner.nextLine();
				String loginPw = inputPw;
				String dbPw = "1234";

				chkPw(loginPw, dbPw);
				if (!loginPw.equals(dbPw)) {
					System.out.println("<<warning>> 비밀번호를 다시 입력해주세요.");
					inputPw = scanner.nextLine();
					loginPw = inputPw;
					dbPw = "1234";
					chkPw(loginPw, dbPw);
				}
			} else {
				System.out.println("<<warning>> 아이디를 다시 입력해주세요.");
				continue outerloop;
			}
			break;
		}
		
		// subject :: char타입 유니코드 변환
		// summary :: 개발자를 위한 application(2)_ 유니코드 디코딩 서비스
		System.out.println("<<Unicode Encoding Service>>");
		System.out.println("유니코드를 입력해주세요 (종료. 0 / 기타문의. 65536) > ");
		
		Scanner scanner = new Scanner(System.in);
		String input = scanner.nextLine();
		int unicode = Integer.parseInt(input);
		char charSet = ' ';
		String inquiry = "";
		
		while(true) {
			if(unicode == 65536) {
				System.out.println("문의하실 내용을 입력해주세요 > ");
				String inputInquiry = scanner.nextLine();
				System.out.println("문의내용 >> " + inputInquiry);
				System.out.println("[문의하신 내용이 관리자에게 전달되어 빠른시일 내에 답변드리겠습니다. 감사합니다.]");
				break;
			}else if(unicode == 0) {
				System.out.println("유니코드 디코딩 서비스가 종료됩니다.");
				break;
			}
			
			if(unicode != 0) {
				charSet = (char)unicode;
				System.out.println("입력하신 유니코드의 문자셋은 " + charSet + " 입니다.");
			}
			break;
		}
		
		// subject :: 특수문자 다루기
		// summary :: 개발자를 위한 application(3)_ 특문 여부 확인 서비스
		// ver 1.
		char[] specialChar = {'\\', 'a', 'b', 'c', 'd'};
		char chkSpecialCha = ' ';
		for(int i = 0; i < specialChar.length; i++) {
			chkSpecialCha = specialChar[i];
			System.out.print(chkSpecialCha);
		}
		if(chkSpecialCha == '\\') {
			System.out.println("특수문자가 포함되어 문자로 인식합니다.");
		}else {
			System.out.println("특수문자가 아닙니다.");
		}
		// ver 2. 
		scanner = new Scanner(System.in);
		System.out.println("문자를 입력하세요 > ");
		input = scanner.nextLine();
		String special = "\\";
		int indexOfSpecial;
		
		for(int i = 0; i < input.length(); i++) {
			indexOfSpecial = input.indexOf(special);

			if(indexOfSpecial != -1) {
				System.out.println("** 입력하신 [" + input + "] 은 특수문자가 포함되어 문자로 인식합니다. **");
				break;
			}else {
				System.out.println("** 입력하신 [" + input + "] 은 특수문자가 아닙니다. **");
				break;
			}
		}

		// subject :: 오버플로우
		// summary :: 개발자를 위한 application(4)_ 최대값/최소값 진위여부 확인 서비스
		byte byteMax = Byte.MAX_VALUE;
		byte byteMin = Byte.MIN_VALUE;
//		Scanner scanner = new Scanner(System.in);

		for(;;) {
			System.out.println("** 최대값/최소값 확인이 필요한 <정수>를 입력해주세요. ** > ");
//			String input = scanner.nextLine();
			int chkMin = Integer.parseInt(input);
			
			if((byteMax + chkMin++) == 0) {
				System.out.println("입력하신 정수의 최소값이 맞습니다.");
				break;
			}else {
				System.out.println("입력하신 정수의 최소값이 아닙니다.");
				if((byteMin + chkMin--) == 0) {
					System.out.println("입력하신 정수의 최대값입니다.");
				}else {
					System.out.println("입력하신 정수의 최대값이 아닙니다.");
				}
				break;
			}
		}
	}
	
	// 로그인 사용자 pw확인용
	static void chkPw(String loginPw, String dbPw) {
		String nickname = "자바사랑";

		if (loginPw.equals(dbPw)) {
			System.out.println("[환영합니다. " + nickname + "님]");
		}
	}
}
