set search_path to chicxulub, public;
-- TODO: add tsearch2 extension to index posts
-- TODO: create user table + foreign key
-- TODO: create category table + foreign key
-- TODO: create tag table
-- TODO: create post_tag join table + foreign key(s)
-- TODO: create index on timestamps
create table post(
  id serial primary key,
  author int not null,
  title text not null,
  slug varchar(80) not null,
  body text not null,
  category int not null,
  created_on timestamptz not null default now(),
  updated_on timestamptz not null default now()
);