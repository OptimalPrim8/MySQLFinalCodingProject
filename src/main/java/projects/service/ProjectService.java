package projects.service;

import java.util.List;
import java.util.NoSuchElementException;

import projects.dao.ProjectDao;
import projects.entity.Project;
import projects.exception.DbException;

public class ProjectService {
    
    private ProjectDao projectDao = new ProjectDao();
    


    
    public Project fetchProjectById(Integer projectId) {
        return projectDao.fetchProjectById(projectId)
                .orElseThrow(() -> new NoSuchElementException("Project with project ID=" + projectId + " does not exist.")); 
    }

 
    public List<Project> fetchAllProjects() {
        try {
			return projectDao.fetchAllProjects();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
    }

    public void modifyProjectDetails(Project project) {
        if (!projectDao.modifyProjectDetails(project)) { 
            throw new DbException("Project with ID=" + project.getProjectId() + " does not exist.");
        }
    }

    public void deleteProject(Integer projectId) { 
        if (!projectDao.deleteProject(projectId)) { 
            throw new DbException("Project with ID=" + projectId + " does not exist.");
        }
    }




	public Project addProject(Project project) {
		// TODO Auto-generated method stub
		return null;
	}
}
