package Main.service;

import java.util.Date;

import Main.DTO.MemberDTO;
import Main.DTO.MemberDao;
import Main.DTO.RegisterRequest;

public class MemberRegisterService {
	// ������ü
	// dto�� �ַ� ������ü�� ��������ʴ´�
	// ���� dao�� ���� dto�� �޾ƿ´�
	private MemberDao memberDao = new MemberDao();
	public void regist(RegisterRequest req) {
		MemberDTO dto = memberDao.selectByEmail(req.getEmail());
		if(dto == null) {
			dto = new MemberDTO();
			dto.setEmail(req.getEmail());
			dto.setName(req.getName());
			dto.setPassword(req.getPassword());
			dto.setRegisterDate(new Date());
			memberDao.insert(dto);
			System.out.println("����� ����� �Ϸ�Ǿ����ϴ�.");
		}else {
			System.out.println("�ߺ� ������Դϴ�.");
		}		
	}
}
