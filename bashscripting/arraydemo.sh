arr=( "Java" "Python" "NodeJs")
size=${#arr[@]}
echo $size

val1=${arr[${index}]}
echo $val1

for ((i=0; i<$size;i++)); do
    echo ${arr[${i}]}
done

echo MSG1