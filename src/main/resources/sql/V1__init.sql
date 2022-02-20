create schema chicxulub;
set search_path to chicxulub, public;
create user chicxulub with encrypted password 'chicxulub';
grant all on schema chicxulub to chicxulub;
alter database chicxulub owner to chicxulub;
