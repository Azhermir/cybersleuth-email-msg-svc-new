# Template Repository

## Using This Repository

The template repository contains definitions for common issue templates that should be used across repositories. When creating a new repository,
this repository can be specified as a repository template and the defined issue templates will be included in the new repository. Using this
repository as a template *does not* copy existing labels, however, which will have to be manually created for the new repository. If you would
like access to the issue templates in this repository and have already created a repository, simply copy the `.github/ISSUE_TEMPLATE` directory
into the root of your repository and manually create the *story*, *task*, and *bug* labels used by the templates.

## Issue Templates

Currently, the following issue templates are defined in this repository:

- **Bug report** issues define defects in the corresponding application(s).
- **Developer task** issues define technical units of work, written from the perspective of a developer. Developer tasks can be associated with
corresponding user stories. To associate a developer task with a user story, link (hashtag) to the issue from an item in the *Tasks* section of
the user story.
- **User story** issues define work from the perspective of user-desired features. User stories have a *Tasks* section that can be used to
list the tasks required for completion of the story, either as task descriptions or as links to corresponding developer task issues. User
stories also have an *Acceptance Tests* section that defines the criteria that must be true for the story to be closed. In addition to
satisfying all of the acceptance tests, a story must pass the standard *Definition of Done* that applies to all work (see below).

### Creating Tasks Using the Template System

The easiest way to create a user story, task, or bug report using a template is to go to the 
[Data Fabric Task Board](https://github.com/orgs/HHG-HAIL/projects/1) page. 
Hit "+ Add Item" in the appropriate swim lane. From that input, hit "#" and then select your repo from the list. 
Then hit "Create new issue" and pick "Bug report", "Developer task", or "User story"

### Linking Tasks

The User Story Template starts with checkboxes which are useful to associate Developer Tasks with the current User Story.
Position the cursor a space after a checkbox and type "#" - you will get a list of possible tasks to link to. Use the text
filter to select a task. This will create a link that should automagically check the box when the Developer Task is closed.

### Definition of Done

In addition to having all acceptance tests pass during demonstration, issues must meet the following criteria to be considered done:

- All code updates required to address the issue have been completed.
- The behavior of any affected application has been tested by the developer.
- The developer has submitted the code for review and, pending acceptance, merged the code into the appropriate branch.
