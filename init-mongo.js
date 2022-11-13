db = db.getSiblingDB('mtwobay');

db.createCollection('tempCollection');

db.createUser({
    user: 'mtwobay',
    pwd: 'changeit',
    roles: [
        {
            role: 'readWrite',
            db: 'mtwobay',
        },
    ],
});
