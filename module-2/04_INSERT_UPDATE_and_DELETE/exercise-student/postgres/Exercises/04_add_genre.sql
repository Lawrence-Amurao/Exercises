-- 4. Add a "Sports" genre to the genre table. Add the movie "Coach Carter" to the newly created genre. (1 row each)
insert into genre (genre_name)
values ('Sports');

select genre_id, genre_name
from genre
where genre_name = 'Sports';
--11771

select title, movie_id
from movie
where title = 'Coach Carter';
--7214

insert into movie_genre (movie_id, genre_id)
values ('7214', '11771');

