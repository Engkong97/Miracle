package com.mantabs.entity.master;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QMKaryawan is a Querydsl query type for MKaryawan
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QMKaryawan extends EntityPathBase<MKaryawan> {

    private static final long serialVersionUID = -1903773815L;

    public static final QMKaryawan mKaryawan = new QMKaryawan("mKaryawan");

    public final DateTimePath<java.util.Date> birthDate = createDateTime("birthDate", java.util.Date.class);

    public final StringPath branchCode = createString("branchCode");

    public final StringPath email = createString("email");

    public final StringPath employeeCode = createString("employeeCode");

    public final StringPath firstName = createString("firstName");

    public final StringPath hpNo = createString("hpNo");

    public final StringPath jabatan = createString("jabatan");

    public final StringPath lastName = createString("lastName");

    public final StringPath middleName = createString("middleName");

    public final StringPath phoneNo = createString("phoneNo");

    public final StringPath positionCode = createString("positionCode");

    public QMKaryawan(String variable) {
        super(MKaryawan.class, forVariable(variable));
    }

    public QMKaryawan(Path<? extends MKaryawan> path) {
        super(path.getType(), path.getMetadata());
    }

    public QMKaryawan(PathMetadata metadata) {
        super(MKaryawan.class, metadata);
    }

}

