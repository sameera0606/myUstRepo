package com.ust.Mark.model;

public class marks {

	private String name;
	private int chemistry;
    private int mathematics;
    private int physics;


    public marks(String name, int chemistry, int mathematics, int physics) {
        this.setName(name);
        this.chemistry = chemistry;
        this.mathematics = mathematics;
        this.physics = physics;
    }

    public int getChemistry() {
        return chemistry;
    }

    public void setChemistry(int chemistry) {
        this.chemistry = chemistry;
    }

    public int getMathematics() {
        return mathematics;
    }

    public void setMathematics(int mathematics) {
        this.mathematics = mathematics;
    }

    public int getPhysics() {
        return physics;
    }

    public void setPhysics(int physics) {
        this.physics = physics;
    }

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}
