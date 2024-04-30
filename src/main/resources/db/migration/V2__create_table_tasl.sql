CREATE TABLE task
(
    id                      SERIAL PRIMARY KEY NOT NULL,
    category                varchar(40)        NOT NULL,
    description             varchar(255)       NOT NULL,
    order_number            INTEGER            NOT NULL,
    scheduled_complete_date DATE               NOT NULL,
    complete_date           DATE               NOT NULL,
    completed               boolean            NOT NULL,
    owner_id                BIGINT             NOT NULL
);

ALTER TABLE task
    ADD CONSTRAINT "FK_OWNER_ID" FOREIGN KEY (owner_id)
        REFERENCES _user (id)
        ON UPDATE CASCADE
        ON DELETE RESTRICT
    NOT VALID;
