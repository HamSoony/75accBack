package com.project.Accounting.acc.base.to;

import lombok.Data;

@Data
public class BaseTO {
	private int errorCode = 0;
	private String errorMsg = "success";

	private String status = "normal";
	private String chk = "0";

}
