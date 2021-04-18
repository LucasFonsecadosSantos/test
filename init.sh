echo "[ .. ] COMPILING"
javac dev/**/*.java -d build/
cd build/
echo "[ OK ] COMPILED"
echo "<date> <small_dog_amount> <big_dog_amount>"
java dev.core.Main
