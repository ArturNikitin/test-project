    var output = (function(x) {
        delete x;
        return x;
    })(0);
    console.log(output);


    (function(){
        var numbers = [2,3,4,8,9,11,13,12,16];
        var even = numbers.filter(function(element, index){
            return element % 2 === 0;
        });
        console.log(even);

        var containsDivisibleby3 = numbers.some(function(element, index){
            return element % 3 === 0;
        });

        console.log(containsDivisibleby3);
    })();


    var getName = function(name) {
        return name;
    }

    var name = getName("Alex");
    console.log(name);

    function getNumber(){
        return (2,4,5);
    }

    var numb = getNumber();
    console.log(numb);

    console.log(1);
    setTimeout(function() {
        console.log(2);
    }, 1000);
    setTimeout(function() {
        console.log(3);
    }, 0);
    console.log(4);


    var Employee = {
        company: 'xyz'
    }
    var emp1 = Object.create(Employee);
    delete emp1.company
    console.log(emp1.company);

    var output = (function(x) {
        delete x;
        return x;
    })(0);
    console.log(output);


    var a = {};
    var b = { key: 'b' };
    var c = { key: 'c' };

    a[b] = 123;
    a[c] = 456;
    console.log(a[b]);

