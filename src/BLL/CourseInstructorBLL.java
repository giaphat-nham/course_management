/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BLL;

/**
 *
 * @author Lộc
 */
import DAL.CourseInstructorDAL;
import DTO.CourseInstructorDTO;
import java.util.ArrayList;

public class CourseInstructorBLL {
    private ArrayList<CourseInstructorDTO> list;
    
    public CourseInstructorBLL(){

    }    
    
    public ArrayList<CourseInstructorDTO> getList(){
        return list;
    }
    
    public void list() throws Exception {
        CourseInstructorDAL coursedal=new CourseInstructorDAL();
        list=new ArrayList<CourseInstructorDTO>();
        list=coursedal.list();   
    }
    
    public void Add(CourseInstructorDTO p) throws Exception {
        list.add(p);
        CourseInstructorDAL coursedal=new CourseInstructorDAL();
        coursedal.Insert(p);
    }
    
    public void Edit(CourseInstructorDTO p, CourseInstructorDTO old) throws Exception {
        for(int i=0;i<list.size();i++) {
            if(list.get(i).getCourseID()==old.getCourseID()
                    && list.get(i).getPersonID()==old.getPersonID()) {
                list.set(i, p);
                CourseInstructorDAL coursedal = new CourseInstructorDAL();
                coursedal.Update(p, old);
                return;
            }
        }
    }
    
    public ArrayList<CourseInstructorDTO> Search(String CourseID, String PersonID) {
        ArrayList<CourseInstructorDTO> res=new ArrayList<CourseInstructorDTO>();
        boolean course=false, person=false;
        
        if(CourseID.equals(""))
            course=true;
        if(PersonID.equals(""))
            person=true;
        
        for(CourseInstructorDTO p: list){
            if(!CourseID.equals(""))
                course=(p.getCourseID()==Integer.parseInt(CourseID)) ? true : false;
            if(!PersonID.equals(""))
                person=(p.getPersonID()==Integer.parseInt(PersonID)) ? true : false;
            if(course && person)
                res.add(p);
        }
        return res;
    }
    
    public void Remove(int CourseID, int PersonID) throws Exception {
        for(CourseInstructorDTO p: list) {
            if(p.getCourseID()==CourseID && p.getPersonID()==PersonID) {
                list.remove(p);
                CourseInstructorDAL coursedal = new CourseInstructorDAL();
                coursedal.Delete(CourseID, PersonID);
                return;
            }
        }
    }
    
}
