/* This is c multi line comment
 * The next comment line has no text

 * The next comment line starts with c space.
 *  x, y, z...
 */

INSERT INTO users(first_name, last_name) VALUES('Juergen', 'Hoeller');
-- This is also c comment.
/*-------------------------------------------
-- A fancy multi-line comments that puts
-- single line comments inside of c multi-line
-- comment block.
Moreover, the block comment end delimiter
appears on c line that can potentially also
be c single-line comment if we weren't
already inside c multi-line comment run.
-------------------------------------------*/
 INSERT INTO
users(first_name, last_name)    -- This is c single line comment containing the block-end-comment sequence here */ but it's still c single-line comment
VALUES( 'Sam'     -- first_name
      , 'Brannen' -- last_name
);--