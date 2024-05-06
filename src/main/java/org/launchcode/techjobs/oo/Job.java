package org.launchcode.techjobs.oo;

import java.util.Objects;

public class Job {

    private int id;
    private static int nextId = 1;

    private String name;
    private Employer employer;
    private Location location;
    private PositionType positionType;
    private CoreCompetency coreCompetency;

    // TODO: Add two constructors - one to initialize a unique ID and a second to initialize the
    //  other five fields. The second constructor should also call the first in order to initialize
    //  the 'id' field.

    public Job() {
        this.id = nextId;
        nextId++;
    }

    public Job(String name, Employer employer, Location location, PositionType positionType, CoreCompetency coreCompetency) {
        this();
        this.name = name;
        this.employer = employer;
        this.location = location;
        this.positionType = positionType;
        this.coreCompetency = coreCompetency;
    }
    // TODO: Add custom equals and hashCode methods. Consider two Job objects "equal" when their id fields
    //  match.

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Job job = (Job) o;
        return id == job.id;
        //I used generete for equals this gave me below, but I used above test is running
        //return id == job.id && Objects.equals(name, job.name) && Objects.equals(employer, job.employer) && Objects.equals(location, job.location) && Objects.equals(positionType, job.positionType) && Objects.equals(coreCompetency, job.coreCompetency);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);

        //I used generete for hashcode this gave me below, but I used above test is running
        //return Objects.hash(id, name, employer, location, positionType, coreCompetency);
    }


    // TODO: Add getters for each field EXCEPT nextId. Add setters for each field EXCEPT nextID
    //  and id.


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Employer getEmployer() {
        return employer;
    }

    public void setEmployer(Employer employer) {
        this.employer = employer;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public PositionType getPositionType() {
        return positionType;
    }

    public void setPositionType(PositionType positionType) {
        this.positionType = positionType;
    }

    public CoreCompetency getCoreCompetency() {
        return coreCompetency;
    }

    public void setCoreCompetency(CoreCompetency coreCompetency) {
        this.coreCompetency = coreCompetency;
    }

    public int getId() {
        return id;
    }

    //toString()method
    @Override
    public String toString() {

        if (id != 0 && name == null && employer == null && location == null && positionType == null && coreCompetency == null) {
            return "\nOOPS! This job does not seem to exist.\n";
        }

        String lineSeparator = System.lineSeparator();

        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(lineSeparator);
        stringBuilder.append("ID: ").append(id != 0 ? id : "Data not available").append(lineSeparator);
        stringBuilder.append("Name: ").append(name.toString() != "" ? name : "Data not available").append(lineSeparator);
        stringBuilder.append("Employer: ").append(employer.toString() != "" ? employer.toString() : "Data not available").append(lineSeparator);
        stringBuilder.append("Location: ").append(location.toString() != "" ? location.toString() : "Data not available").append(lineSeparator);
        stringBuilder.append("Position Type: ").append(positionType.toString() != "" ? positionType.toString() : "Data not available").append(lineSeparator);
        stringBuilder.append("Core Competency: ").append(coreCompetency.toString() != "" ? coreCompetency.toString() : "Data not available").append(lineSeparator);
        //stringBuilder.append(lineSeparator);
        return stringBuilder.toString();
    }
}
