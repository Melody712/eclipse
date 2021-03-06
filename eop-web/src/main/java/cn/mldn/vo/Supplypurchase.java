package cn.mldn.vo;

import java.io.Serializable;
import java.util.Date;

@SuppressWarnings("serial")
public class Supplypurchase implements Serializable {
	private Long spid;
	private String eid;
	private String aeid;
	private String title;
	private String note;
	private Double money;
	private Integer amount;
	private Integer status;
	private Date pubdate;
	private Date auditdate;
	private String anote;
	public Long getSpid() {
		return spid;
	}
	public void setSpid(Long spid) {
		this.spid = spid;
	}
	public String getEid() {
		return eid;
	}
	public void setEid(String eid) {
		this.eid = eid;
	}
	public String getAeid() {
		return aeid;
	}
	public void setAeid(String aeid) {
		this.aeid = aeid;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getNote() {
		return note;
	}
	public void setNote(String note) {
		this.note = note;
	}
	public Double getMoney() {
		return money;
	}
	public void setMoney(Double money) {
		this.money = money;
	}
	public Integer getAmount() {
		return amount;
	}
	public void setAmount(Integer amount) {
		this.amount = amount;
	}
	public Integer getStatus() {
		return status;
	}
	public void setStatus(Integer status) {
		this.status = status;
	}
	public Date getPubdate() {
		return pubdate;
	}
	public void setPubdate(Date pubdate) {
		this.pubdate = pubdate;
	}
	public Date getAuditdate() {
		return auditdate;
	}
	public void setAuditdate(Date auditdate) {
		this.auditdate = auditdate;
	}
	public String getAnote() {
		return anote;
	}
	public void setAnote(String anote) {
		this.anote = anote;
	}
	@Override
	public String toString() {
		return "Supplypurchase [spid=" + spid + ", eid=" + eid + ", aeid=" + aeid + ", title=" + title + ", note="
				+ note + ", money=" + money + ", amount=" + amount + ", status=" + status + ", pubdate=" + pubdate
				+ ", auditdate=" + auditdate + ", anote=" + anote + "]";
	}
}
