
public class Exercise {
	public String title;
	public String description;
	public String[] targets;
	public double personalBest = 0.0;
	public Exercise() {
		title = "";
		description = "";
		}
	public Exercise(String name, String desc, String[] muscles) {
		title = name;
		description = desc;
		targets = muscles;
	}
	public String getTitle(){
		return title;
	}
	public String getDescrption() {
		return description;
	}
	public String[] getTargets() {
		return targets;
	}
	public String targetsToString() {
		String ret = "";
		for(int i=0;i<targets.length;i++) {
			ret+=targets[i];
			if(i!=targets.length-1) {
				ret+=", ";
			}
		}
		return ret;
	}
	public String personalBestToString() {
		if(personalBest == 0.0) {
			return "N/A";
		}
		else {
			return "" + personalBest;
		}
		
	}

	public double getPersonalBest() {
		return personalBest;
	}
}
