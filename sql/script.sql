create database pet_medicine_system;
create table doctor
(
    id                      int auto_increment comment 'id'
        primary key,
    d_name                  varchar(10)  default ''                not null comment '医生名字',
    d_username              varchar(10)  default ''                not null comment '账号',
    d_password              varchar(12)  default ''                not null comment '密码',
    d_hospital              varchar(64)  default ''                not null comment '所属医疗机构',
    d_phone                 varchar(11)  default ''                not null comment '联系电话',
    d_introduce             varchar(256) default ''                not null comment '医生介绍',
    d_introduce_photos_link varchar(256) default ''                not null comment '医生图片',
    create_time             datetime     default CURRENT_TIMESTAMP not null comment '创建时间',
    update_time             datetime     default CURRENT_TIMESTAMP not null on update CURRENT_TIMESTAMP comment '更新时间',
    is_delete               tinyint      default 0                 not null comment '是否删除，0-否，1-是'
)
    comment '兽医信息表';

create table hospital
(
    id                      int auto_increment comment 'id'
        primary key,
    h_name                  varchar(64)  default ''                not null comment '医疗机构名称',
    h_username              varchar(10)  default ''                not null comment '账号',
    h_password              varchar(12)  default ''                not null comment '密码',
    h_work_time             varchar(12)  default ''                not null comment '营业时间',
    h_phone                 varchar(11)  default ''                not null comment '联系电话',
    h_address               varchar(256) default ''                not null comment '医疗机构地址',
    h_introduce             varchar(256) default ''                not null comment '医疗机构介绍',
    h_introduce_photos_link varchar(256) default ''                not null comment '医疗机构图片',
    create_time             datetime     default CURRENT_TIMESTAMP not null comment '创建时间',
    update_time             datetime     default CURRENT_TIMESTAMP not null on update CURRENT_TIMESTAMP comment '更新时间',
    is_delete               tinyint      default 0                 not null comment '是否删除，0-否，1-是',
    h_evaluation            int          default 0                 null comment '医院星级评价'
)
    comment '医疗机构信息表';

create table image_text
(
    id             int auto_increment comment 'id'
        primary key,
    c_id           int                                    not null comment '养宠人id',
    it_type        int                                    not null comment '帖子类型(1是在线询问，0是分享)',
    it_text        varchar(256) default ''                not null comment '帖子内容',
    it_photos_link varchar(256) default ''                not null comment '帖子图片',
    create_time    datetime     default CURRENT_TIMESTAMP not null comment '创建时间',
    update_time    datetime     default CURRENT_TIMESTAMP not null on update CURRENT_TIMESTAMP comment '更新时间',
    is_delete      tinyint      default 0                 not null comment '是否删除，0-否，1-是'
)
    comment '图文表';

create table image_text_interaction
(
    id          int auto_increment comment 'id'
        primary key,
    it_id       int                                    not null comment '图文id',
    iti_type    int                                    not null comment '互动类型(1是点赞，2是评论，3是分享)',
    iti_text    varchar(256) default ''                null comment '互动内容（评论才会有',
    iti_id_type int                                    not null comment '互动用户(1是养宠人，2是兽医，3是医疗机构',
    iti_id      int                                    not null comment '互动用户ID',
    create_time datetime     default CURRENT_TIMESTAMP not null comment '创建时间',
    update_time datetime     default CURRENT_TIMESTAMP not null on update CURRENT_TIMESTAMP comment '更新时间',
    is_delete   tinyint      default 0                 not null comment '是否删除，0-否，1-是'
)
    comment '互动表';

create table medical_service
(
    id                      int auto_increment comment 'id'
        primary key,
    h_name                  varchar(64)  default ''                not null comment '医疗机构名称',
    ms_introduce            varchar(256) default ''                not null comment '服务信息',
    ms_price                int          default 0                 not null comment '服务价格',
    h_introduce_photos_link varchar(256) default ''                not null comment '服务图片',
    create_time             datetime     default CURRENT_TIMESTAMP not null comment '创建时间',
    update_time             datetime     default CURRENT_TIMESTAMP not null on update CURRENT_TIMESTAMP comment '更新时间',
    is_delete               tinyint      default 0                 not null comment '是否删除，0-否，1-是'
)
    comment '医疗服务信息表';

create table pet
(
    id               int auto_increment comment 'id'
        primary key,
    p_name           varchar(24)  default ''                not null comment '宠物名称',
    p_address        varchar(256) default ''                not null comment '宠物所在地址',
    p_introduce      varchar(256) default ''                not null comment '宠物介绍',
    p_photos_link    varchar(256) default ''                not null comment '宠物图片',
    pet_keeper_id    int                                    not null comment '养宠人id',
    pet_keeper_phone varchar(11)  default ''                not null comment '养宠人联系电话',
    create_time      datetime     default CURRENT_TIMESTAMP not null comment '创建时间',
    update_time      datetime     default CURRENT_TIMESTAMP not null on update CURRENT_TIMESTAMP comment '更新时间',
    is_delete        tinyint      default 0                 not null comment '是否删除，0-否，1-是'
)
    comment '宠物信息表';

create table pet_keeper
(
    id          int auto_increment comment 'id'
        primary key,
    c_name      varchar(16)  default ''                not null comment '养宠人昵称',
    c_username  varchar(10)  default ''                not null comment '账号',
    c_password  varchar(12)  default ''                not null comment '密码',
    c_phone     varchar(11)  default ''                not null comment '联系电话',
    c_address   varchar(256) default ''                not null comment '家庭地址',
    create_time datetime     default CURRENT_TIMESTAMP not null comment '创建时间',
    update_time datetime     default CURRENT_TIMESTAMP not null on update CURRENT_TIMESTAMP comment '更新时间',
    is_delete   tinyint      default 0                 not null comment '是否删除，0-否，1-是'
)
    comment '养宠人信息表';

create table reserve_information
(
    id                     int auto_increment comment 'id'
        primary key,
    c_id                   int                                    not null comment '养宠人id',
    ms_id                  int                                    not null comment '医疗服务id',
    ri_process             int                                    not null comment '服务进程(数字类型)',
    ri_process_detail      varchar(256) default ''                not null comment '服务进程(文字介绍)',
    ri_process_photos_link varchar(256) default ''                not null comment '服务图片',
    create_time            datetime     default CURRENT_TIMESTAMP not null comment '创建时间',
    update_time            datetime     default CURRENT_TIMESTAMP not null on update CURRENT_TIMESTAMP comment '更新时间',
    is_delete              tinyint      default 0                 not null comment '是否删除，0-否，1-是',
    ri_evaluation          int          default 0                 null comment '服务评价星级',
    ri_evaluation_text     varchar(256) default ''                null comment '服务评价'
)
    comment '用户预约信息表';