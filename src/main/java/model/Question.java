package model;

/**
 * Question generated by hbm2java
 */
public class Question implements java.io.Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String title;
	private String description;
	private int number;
	private String type;
	private String opA;
	private String opB;
	private String opC;
	private String opD;
	private String opE;
	private String opF;
	private String opG;
	private String opH;
	private String opI;

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getOpA() {
		return opA;
	}

	public void setOpA(String opA) {
		this.opA = opA;
	}

	public String getOpB() {
		return opB;
	}

	public void setOpB(String opB) {
		this.opB = opB;
	}

	public String getOpC() {
		return opC;
	}

	public void setOpC(String opC) {
		this.opC = opC;
	}

	public String getOpD() {
		return opD;
	}

	public void setOpD(String opD) {
		this.opD = opD;
	}

	public String getOpE() {
		return opE;
	}

	public void setOpE(String opE) {
		this.opE = opE;
	}

	public String getOpF() {
		return opF;
	}

	public void setOpF(String opF) {
		this.opF = opF;
	}

	public String getOpG() {
		return opG;
	}

	public void setOpG(String opG) {
		this.opG = opG;
	}

	public String getOpH() {
		return opH;
	}

	public void setOpH(String opH) {
		this.opH = opH;
	}

	public String getOpI() {
		return opI;
	}

	public void setOpI(String opI) {
		this.opI = opI;
	}

	@Override
	public String toString() {
		return "Question [title=" + title + ", description=" + description + ", number=" + number + ", type=" + type + ", opA=" + opA + ", opB=" + opB + ", opC=" + opC + ", opD=" + opD + ", opE="
				+ opE + ", opF=" + opF + ", opG=" + opG + ", opH=" + opH + ", opI=" + opI + "]";
	}
}
