plugins {
    java
}

java {
    sourceCompatibility = JavaVersion.VERSION_11
    targetCompatibility = JavaVersion.VERSION_11
}


val rocksdbVersion = "5.17.2"
dependencies {
    implementation("org.rocksdb:rocksdbjni:$rocksdbVersion")
}