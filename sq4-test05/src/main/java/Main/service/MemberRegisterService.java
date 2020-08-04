package Main.service;

import java.util.Date;

import Main.DTO.MemberDTO;
import Main.DTO.MemberDao;
import Main.DTO.RegisterRequest;

public class MemberRegisterService {
	// 의존객체
	// dto는 주로 의존객체를 사용하지않는다
	// 따라서 dao로 부터 dto를 받아온다
	private MemberDao memberDao;
	// 방법 1(생성자) 의존객체를 주입 : Dependency Injection
	public MemberRegisterService(MemberDao memberDao) {
		this.memberDao = memberDao;
	}
	
	/*// 방법2
	public void setMemberDao() {
		memberDao = new MemberDao();
	}
	*/
	public void regist(RegisterRequest req) {
		MemberDTO dto = memberDao.selectByEmail(req.getEmail());
		if(dto == null) {
			dto = new MemberDTO();
			dto.setEmail(req.getEmail());
			dto.setName(req.getName());
			dto.setPassword(req.getPassword());
			dto.setRegisterDate(new Date());
			memberDao.insert(dto);
			System.out.println("사용자 등록이 완료되었습니다.");
		}else {
			System.out.println("중복 사용자입니다.");
		}		
	}
}
