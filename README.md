# sports-club-membership
Advanced Modeling and Design of Software Project


Project directory structure

out
 member.jar
 membership.jar
src
 -> member
	-> member
		memberMgt Component classes & interfaces
	-> META-INF
 -> membership
	-> membership
		membership Component classes & interfaces
	-> META-INF


Instructions to execute the jar files, supposing java is installed:
	1. unzip the archive
	2. project->out
	3. open command promt there by selecting path and writing cmd or open cmd and go to the "out" folder
	4. write "java -jar member.jar" to run member component
	5. write "java -jar membership.jar" to run membership component


Explanation of testing the member component:
	1. welcoming message
	2. first we try to add a new member "Maria" that has 15 years
	3. we add another member john by introducing name, postal code and age
	4. we add a subscriber
	5. another member pays the fee
	6. a member with voting rights votes
	7,8,9,10. we are printing all the members and extra dated depending on their type

Explanation of testing the membership component:
	1. welcoming message
	2. the member with Adult membership pays the fee
	3. the member with Child membership pays the fee
	4. the member with Silver membership pays the fee
	5. the member with Gold membership pays the fee
	6. pending on change the membership type
	7,..,25. we are printing all the membership data: id, start date, end date and the price depending on the membership type.
