/**
 *  A class to model part time student
 */
package studentlistwed;

/**
 *
 * @author adits
 */
public class PartTimeStudent extends Student {
    
    private int numCourses;
    
    public PartTimeStudent(String name, int givenNumCourses)
    {
        super(name);
        numCourses = givenNumCourses;
    }

    /**
     * @return the numCourses
     */
    public int getNumCourses() {
        return numCourses;
    }

    /**
     * @param numCourses the numCourses to set
     */
    public void setNumCourses(int numCourses) {
        this.numCourses = numCourses;
    }
}
