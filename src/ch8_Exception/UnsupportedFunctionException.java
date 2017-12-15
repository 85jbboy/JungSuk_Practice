package ch8_Exception;

public class UnsupportedFunctionException extends RuntimeException{
	private final int ERR_CODE;
	
	UnsupportedFunctionException(String msg, int errCode) {
		super(msg);		// 해당 클래스의 인스턴스변수가 아니므로 상위에서 초기화하도록 함.
		ERR_CODE = errCode;
	}
	
	UnsupportedFunctionException(String msg) {
		this(msg, 100);
	}
	public int getErrCode() {
		return ERR_CODE;
	}
	
	public String getMessage() {
		return "["+getErrCode()+"]"+ super.getMessage();
	}
}
