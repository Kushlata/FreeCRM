package com.crm.qa.util;

public class GitTutorial {

}



/*
GitHUB: GitHub is a code hosting platform for collaboration and version control. (Website)
GitHub lets you (and others) work together on projects.

Servies provided by github:
1. Wiki Pages
2. task Management
3. Bug tracking
4. Hosting Services for git(Repository)


Git repository have the branches:
1. Master Branch
2. Feature Branch

Checkin: push the code
Checkout: pull the code

Github(kind of server): It is a hosting service
Git (repository) : It is a tool

Different source management tools:
GIT, SVN, TFS(Microsoft), VSTS(Microsoft), VSS, BitBucket


Git init--->Git add remote origin(url)----> Git status----->git add-----> git status----> git commit----> git push origin master(branch name)

Steps to set up github account
1. Go to site www.github.com
2. Create your personal account
 Username: Kushlata
 Email address: Kushalata1995@gmail.com
 Password: lata@1995
 
 3. after creation of the account, verify your email.
 4. Click on add button to create a repository.
 5. Go to project inside the eclipse and copy the complete project path. example( C:\Users\c5265218\Downloads\PageObjectModel-master)
 6. Open the command prompt.
 7.  TYpe command cd complete path of the project and press enter
 8. We need to initialize our git inside the project
 9. In console Enter command git init and press enter
 10. Now we get message of empty git in the command prompt.
 11. This .git file is hidden inside the project. To view it
 12. Type ls-alt, it will show .git file here. (this can be view in window by right click inside the project)
 13. Copy path of the githud repository and paste it in cmd. example(git remote add origin https://github.com/Kushlata/FreeCRM.git)
  Since the repo is present remotely it is showing remote in the path. This step will register project at this location.
 
 Connection between project and git repository get establish via this step.
 
14. To check what all files are pending to pull, we need to check the status
  git status (red status)
  
15. To add the complete project:
 git add .(dot- for complete project)
 
16. Again check the status via
   git status (Now all files are imported- green status)
   
17. To push the code, you need to commit it, (-n is for writting the comment)
 git commit -m "comment_msg"
 
 18. By default one master branch is created inside the repo. for pushing the code at the master node.
 git push origin master
 
 19. For pusing the code SSH key is required, otherwise it will not allow to push the code
 20. For pulling the code, it does not need any key.

 
# Steps to pull the code
1. go to the required directory, where you want to pull the code.
 cd path_of_the_directory
 
 or you can create a directory
 mkdir dirctory_name
 
2. move to that directory
 cd directory_path
 
3. For pulling code first time, we need to clone the code. Clone means making a local repository for pulling the code. ITs like a downloading complete project from git to local storage.
 git clone git_diectorylink(from where you are pulling from git)
 
4. Then go to eclipse and and import the project. 
5.  Next time you need to only pull the code
6. Go to the local directory
cd local_project_path

7. Pull the clode from master branch
git pull origin master

*/