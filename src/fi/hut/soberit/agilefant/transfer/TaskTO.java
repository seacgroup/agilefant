package fi.hut.soberit.agilefant.transfer;

import java.util.ArrayList;
import java.util.Collection;

import fi.hut.soberit.agilefant.model.Task;
import fi.hut.soberit.agilefant.util.BeanCopier;
import fi.hut.soberit.agilefant.util.ResponsibleContainer;
import flexjson.JSON;

public class TaskTO extends Task {
   
    // Helper fields
    
    private Collection<ResponsibleContainer> userData = new ArrayList<ResponsibleContainer>();
    private long effortSpent;    

    public TaskTO(Task task) {
        BeanCopier.copy(task, this);
//        this.setId(task.getId());
//        this.setName(task.getName());
//        this.setDescription(task.getDescription());
//        this.setIteration(task.getIteration());
//        this.setStory(task.getStory());
//        this.setState(task.getState());
//        this.setEffortLeft(task.getEffortLeft());
//        this.setOriginalEstimate(task.getOriginalEstimate());
//        this.setResponsibles(task.getResponsibles());
//        this.setHourEntries(task.getHourEntries());
//        this.setRank(task.getRank());
    }
    
    public void setUserData(Collection<ResponsibleContainer> userData) {
        this.userData = userData;
    }

    @JSON(include = true)
    public Collection<ResponsibleContainer> getUserData() {
        return userData;
    }


    public long getEffortSpent() {
        return effortSpent;
    }

    public void setEffortSpent(long effortSpent) {
        this.effortSpent = effortSpent;
    }

}

