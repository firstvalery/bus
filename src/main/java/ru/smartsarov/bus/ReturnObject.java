package ru.smartsarov.bus;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.List;

import io.swagger.annotations.ApiModel;

@ApiModel(value="ReturnObject", description="Объект с ошибками и pkid сохранненной сущности")
public class ReturnObject {
	private long pkid;
	private List<DataValidationLog> errorsLog;
	private boolean hasErrors = false;
	private String erorMessage = null;
	private String successMessage = null;
	private String erorTrace = null;

	public ReturnObject() {
		this.errorsLog = new ArrayList<>();
	}
	public ReturnObject(long pkid) {
		this.errorsLog = new ArrayList<>();
		this.pkid = pkid;
	}
	
	public void addError(String messageSource, String messageText) {
		errorsLog.add(new DataValidationLog(messageSource, messageText));
		hasErrors = true;
	}

	public boolean getHasErrors() {
		return hasErrors;
	}
	
	public void setException(Throwable ex) {
		ex.printStackTrace();
		StringWriter sw = new StringWriter();
		ex.printStackTrace(new PrintWriter(sw));
		
		erorTrace = sw.toString().replaceAll("\"", "\\\"").replaceAll("\\\\", "\\\\");
		if(erorTrace.length()>10000)erorTrace=erorTrace.substring(0,10000);
		hasErrors=true;
	}
	
	public long getPkid() {
		return pkid;
	}
	public void setPkid(long pkid) {
		this.pkid = pkid;
	}
	public String getErorMessage() {
		return erorMessage;
	}
	public void setErorMessage(String erorMessage) {
		this.hasErrors = true;
		this.erorMessage = erorMessage;
	}
	public String getSuccessMessage() {
		return successMessage;
	}
	public void setSuccessMessage(String successMessage) {
		this.successMessage = successMessage;
	}
	
	@ApiModel(value="DataValidationLog", description="Объект с ошибкой")
	class DataValidationLog {
		private String messageSource;
		private String messageText;

		public DataValidationLog() {
		}
		public DataValidationLog(String messageSource, String messageText) {
			this.setMessageSource(messageSource);
			this.setMessageText(messageText);
		}
		public String getMessageSource() {
			return messageSource;
		}
		public void setMessageSource(String messageSource) {
			this.messageSource = messageSource;
		}
		public String getMessageText() {
			return messageText;
		}
		public void setMessageText(String messageText) {
			this.messageText = messageText;
		}
	}

}