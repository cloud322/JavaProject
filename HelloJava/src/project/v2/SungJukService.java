package project.v2;

import project.v1.SungJukV0;

public interface SungJukService {
	//성적 데이터 CRUD 처림 - 저장 조회 수정 삭제
	void addSungJuk(SungJukV0 sj);	//저장할때~~
	String getSungJuk();
	String getSungJuk(int no);
	void modifySungJuk(SungJukV0 sj, int no);
	void removeSungJuk(int no);
	
}
