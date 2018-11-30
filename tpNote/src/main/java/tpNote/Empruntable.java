package tpNote;

public abstract class Empruntable {
	protected boolean limitationPretAgence = false;
	private boolean defectueux = false;
	
	public void declarerDefectueux() {
		defectueux = true;
	}
	public boolean isDefectueux() {
		return defectueux;
	}
	public boolean isLimitationPretAgence() {
		return limitationPretAgence;
	}
	public void setLimitationPretAgence(boolean limitation) {
		limitationPretAgence = limitation;
	}	
	
}
