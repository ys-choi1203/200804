package Main.service;


import Main.DTO.CachedMemberDao;
import Main.DTO.MemberDTO;
import Main.DTO.MemberDao;

public class MemberInfoPrinter {
	private MemberDao memberDao = new MemberDao();
	private MemberPrinter printer = new MemberPrinter();
	
	//의존객체를 주입 : Dependency Injection(DI)
	public void setMemberDao(MemberDao memberDao) {
		this.memberDao = memberDao;
	}
	//의존객체를 주입 : Dependency Injection(DI)
	public void setPrinter(MemberPrinter printer) {
		this.printer = printer;
	}
	
	public void printMemberInfo(String eamil) {
		MemberDTO dto = memberDao.selectByEmail(eamil);
		if(dto == null) {
			System.out.println("데이터없음\n");
			return;
		}
		printer.print(dto);
	}
}
