drop table if exists members;
drop table if exists interest_groups;
drop table if exists member_groups;
drop table if exists events;
drop table if exists event_attendees;

BEGIN TRANSACTION;

CREATE TABLE members
(
        memberId serial,
        firstName varchar(64) not null,
        lastName varchar(64) not null,
        email varchar(64) not null,
        phoneNumber varchar(11),
        birthday date not null,
        isOkToEmail boolean not null,
       
        
        constraint pk_members primary key (memberId)

);



CREATE TABLE interest_groups
(
        groupId serial,
        groupName varchar(64) not null,
        memberCount int,
        
        constraint pk_interest_groups primary key (groupId)
        
        
);

CREATE TABLE member_groups
(
        memberId serial,
        groupId serial,
        
        constraint pk_member_groups primary key(memberId, groupId),
        constraint fk_member_groups_members foreign key (memberId) references members(memberId),
        constraint fk_member_groups_interest_groups foreign key(groupId) references interest_groups(groupId)
        
        
);



CREATE TABLE events
(
        eventId serial,
        eventName varchar(64) not null,
        description varchar(64) not null,
        startDate date not null,
        startTime time not null,
        duration time not null,
        hostGroupId int,
        attendeeCount int,
        
        
        constraint pk_events primary key (eventId),
        constraint fk_events_interest_groups foreign key (hostGroupId) references interest_groups(groupId)
        

);

CREATE TABLE event_attendees
(
        eventId int,
        attendeeId int,
        
        constraint pk_event_attendees primary key (eventId, attendeeId),
        constraint fk_event_attendees_members foreign key (attendeeId) references members(memberId),
        constraint fk_event_attendees_events foreign key (eventId) references events(eventId)
        
);

COMMIT TRANSACTION;
