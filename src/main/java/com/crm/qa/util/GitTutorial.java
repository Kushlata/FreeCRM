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
 
*/