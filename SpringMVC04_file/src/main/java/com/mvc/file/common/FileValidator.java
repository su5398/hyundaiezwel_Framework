package com.mvc.file.common;

import org.springframework.stereotype.Service;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

@Service
public class FileValidator implements Validator{

	@Override
	public boolean supports(Class<?> clazz) {
		return UploadFile.class.equals(clazz);
	}

	@Override
	public void validate(Object target, Errors errors) {
		UploadFile file = (UploadFile)target;
		
		if(file.getMpfile().getSize() == 0) {
			errors.rejectValue("mpfile","fileNPE","please select a file");
			//mpfile : 문제가 발생한 필드이름
			//fileNPE: 오류 코드
			//"pleas ... : 오류 메세지
		}
	}

}
