function Hello()
{
    echo "My First Function"
}
Hello


Hello

: 'MyFunc2()
{
    result=$(($1+$2))
    echo "Result is $result"
}

MyFunc2 10 30'

function MyFunc2()
{
    result=$(($1+$2))
    echo $result
    #return result
}

value=$(MyFunc2 10 30)
echo "addition $value"