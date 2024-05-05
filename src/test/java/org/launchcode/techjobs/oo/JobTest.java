package org.launchcode.techjobs.oo;

import org.junit.Assert;
import org.junit.Test;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Objects;

import static java.lang.System.lineSeparator;
import static org.junit.Assert.*;

public class JobTest extends AbstractTest {
    //TODO: Create your unit tests here
    @Test
    public void testSettingJobId() {
        Job firstJob=new Job();
        Job secondJob=new Job();
        System.out.println(firstJob.getId());
        System.out.println(secondJob.getId());

        assertNotEquals(firstJob.getId(),secondJob.getId());
    }
    @Test
    public void testJobConstructorSetsAllFields() {
        Job job= new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));

//        if((job.getName() instanceof String)){
//            assertEquals(job.getName(),"Product tester");
//            System.out.println("running if blok for name");
//        }else{
//            assertEquals(job.getName().toString(),"Product tester");
//            System.out.println("running else blok for name");
//        }
//
//        if(job.getEmployer() instanceof Employer ){
//            assertEquals(job.getEmployer().toString(), "ACME");
//            System.out.println("running if blok for employer");
//        }else{
//            assertEquals(job.getEmployer(), "ACME");
//            System.out.println("running else blok for employer");
//        }

        assertEquals(job.getName(),"Product tester");
        assertEquals(job.getEmployer().toString(), "ACME");
        assertEquals(job.getEmployer().toString(), "ACME");
        assertEquals(job.getLocation().toString(), "Desert");
        assertEquals(job.getPositionType().toString(), "Quality control");
        assertEquals(job.getCoreCompetency().toString(), "Persistence");
    }
    @Test
    public void testJobsForEquality() {
        Job firstJob= new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        Job secondJob= new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));

        assertEquals(firstJob.equals(secondJob), false);
    }

    @Test
    public void testToStringStartsAndEndsWithNewLine() throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Job job = createJob("Web Developer", "LaunchCode", "StL", "Back-end developer", "Java");
        String firstChar = String.valueOf(job.toString().charAt(0));
        String lastChar = String.valueOf(job.toString().charAt(job.toString().length()-1));
        assertEquals(firstChar, lineSeparator());
        assertEquals(lastChar, lineSeparator());
    }

    @Test
    public void testToStringContainsCorrectLabelsAndData() throws ClassNotFoundException, InvocationTargetException, NoSuchMethodException, InstantiationException, IllegalAccessException, NoSuchFieldException {
        Job job = createJob("Web Developer", "LaunchCode", "StL", "Back-end developer", "Java");
        String jobString = getJobString(job);
        assertEquals(jobString, job.toString());
    }

    @Test
    public void testToStringHandlesEmptyField() throws ClassNotFoundException, InvocationTargetException, NoSuchMethodException, InstantiationException, IllegalAccessException, NoSuchFieldException {
        Job job = createJob("Web Developer", "", "StL", "", "Java");
        String jobString = getJobString(job);
        assertEquals(jobString, job.toString());
    }


}
