package kbiz.edu.test.log;

import java.util.List;
import java.util.Map;

public interface LogService {

	//결재리스트 조회
	List<Map<String,Object>> searchPermissionList();
	
	//로그아웃
}
