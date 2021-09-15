select eventId, eventName, description, startDate, startTime, duration, hostGroupId, attendeeCount
from events
order by eventId;




insert into events (eventId, eventName, description, startDate, startTime, duration)
values ('1001', 'Gryffindor Keeper Tryouts', 'Looking for a good keeper', '1994/09/15', '11:00', '2:00');

update events
set hostGroupId = (
select groupId 
from interest_groups 
where groupName = 'Gryffindor Quidditch Team')
where eventId = '1001';

insert into events (eventId, eventName, description, startDate, startTime, duration)
values ('1002', 'Potion Making Contest', 'Winner gets a vial of Felix Felicis', '1994/10/20', '12:00', '2:30');

update events
set hostGroupId = (
select groupId 
from interest_groups 
where groupName = 'Potions Club')
where eventId = '1002';

insert into events (eventId, eventName, description, startDate, startTime, duration)
values ('1003', 'Extra Herbology Review', 'Herbology Review for OWLs and NEWTs', '1995/01/15', '09:00', '3:00');

update events
set eventName = 'Extra Herbology Review'
where eventId= '1003';

update events
set hostGroupId = (
select groupId 
from interest_groups 
where groupName = 'Herbology Study Group')
where eventId = '1003';

insert into events (eventId, eventName, description, startDate, startTime, duration)
values ('1004', 'Quidditch Practice', 'First Quidditch practice of the year', '1995/01/20', '08:00', '4:00');

update events
set hostGroupId = (
select groupId 
from interest_groups 
where groupName = 'Gryffindor Quidditch Team')
where eventId = '1004';

update events
set attendeeCount = (
select count(*)
from event_Attendees
where eventId = '1001')
where eventId = '1001';

update events
set attendeeCount = (
select count(*)
from event_Attendees
where eventId = '1002')
where eventId = '1002';

update events
set attendeeCount = (
select count(*)
from event_Attendees
where eventId = '1003')
where eventId = '1003';

update events
set attendeeCount = (
select count(*)
from event_Attendees
where eventId = '1004')
where eventId = '1004';