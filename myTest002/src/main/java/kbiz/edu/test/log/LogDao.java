package kbiz.edu.test.log;

import java.util.List;
import java.util.Map;

public interface LogDao {
	
	//로그인 - 결재리스트 조회
	List<Map<String, Object>> searchPermissionList();

}
