# Introduction #

These are the use cases which describe how a user will interact with this application.  We are purposefully keeping them simple so that we can achieve a working application within the time frame of the book club.

# Details #


**Use case U1:  User wants to ask a question about some user's code to the Hibernate group.**
  1. User enters message (limited to 256 chars) in the html form as:
> > "Hey #hibernate, does anyone know how to do many-to-many optimization as found in the code that @bsmith wrote?
  1. System displays message to everyone following "hibernate" group and to developer "bsmith"

> (note: # denotes groups and @ denotes specific people)

**Use case U1A: User wants to find out what groups are available.**
  1. User selects "Groups" navigation link.
  1. System displays groups in alphabetical order along with a short description, date/time of last post, and number of current members.
  1. User selects a particular group in the list
  1. System displays member list for the selected group

**Use case U1B: User wants to join a group.**
  * Prerequisite: U1A
  1. User clicks the JOIN link next to each group they want to join.
  1. System changes join link to leave link so user can un-join the group

**Use case U2: User B wants to reply to User A's message.**
  1. user B selects User A's message
  1. System expands the message to show all comments
  1. user B types response to message in html form and posts
  1. System adds user B's response to the thread of comments below user A's message.

**Use case U3: User C is looking for information on many-to-many optimizations in Hibernate.**
  1. user C types "hibernate many" into the search field
  1. System displays list of messages with all their comments where the search terms "hibernate AND many" is contained anywhere within the thread.