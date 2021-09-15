select groupId, groupName, memberCount
from interest_groups;

insert into interest_groups (groupName, groupId)
values ('Gryffindor Quidditch Team', '101');

insert into interest_groups (groupName, groupId)
values ('Potions Club', '102');

insert into interest_groups (groupName, groupId)
values ('Herbology Study Group', '103');

update interest_groups
set memberCount = (
select count(*)
from member_groups
where groupId = '101')
where groupName = 'Gryffindor Quidditch Team';

update interest_groups
set memberCount = (
select count(*)
from member_groups
where groupId = '102')
where groupName = 'Potions Club';

update interest_groups
set memberCount = (
select count(*)
from member_groups
where groupId = '103')
where groupName = 'Herbology Study Group';
 
select groupId, groupName, memberCount
from interest_groups;
