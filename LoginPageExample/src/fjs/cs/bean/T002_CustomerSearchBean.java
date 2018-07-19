package fjs.cs.bean;

import org.apache.struts.action.ActionForm;

public class T002_CustomerSearchBean extends ActionForm{
	private String txtCustomerName;
	private String cboSex;
	private String txtBirthdayFrom;
	private String txtBirthdayTo;
	public String getTxtCustomerName() {
		return txtCustomerName;
	}
	public void setTxtCustomerName(String txtCustomerName) {
		this.txtCustomerName = txtCustomerName;
	}
	public String getCboSex() {
		return cboSex;
	}
	public void setCboSex(String cboSex) {
		this.cboSex = cboSex;
	}
	public String getTxtBirthdayTo() {
		return txtBirthdayTo;
	}
	public void setTxtBirthdayTo(String txtBirthdayTo) {
		this.txtBirthdayTo = txtBirthdayTo;
	}
	public String getTxtBirthdayFrom() {
		return txtBirthdayFrom;
	}
	public void setTxtBirthdayFrom(String txtBirthdayFrom) {
		this.txtBirthdayFrom = txtBirthdayFrom;
	}
	
}
