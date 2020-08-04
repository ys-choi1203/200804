package Main.service;

import Main.DTO.CachedMemberDao;
import Main.DTO.MemberDTO;
import Main.DTO.MemberDao;

public class MemberInfoPrinter {
	private CachedMemberDao memberDao = new CachedMemberDao();
	//private MemberDao memberDao = new MemberDao();
	private MemberPrinter printer = new MemberPrinter();
	public void printMemberInfo(String eamil) {
		MemberDTO dto = memberDao.selectByEmail(eamil);
		if(dto == null) {
			System.out.println("데이터없음\n");
			return;
		}
		printer.print(dto);
	}
}
