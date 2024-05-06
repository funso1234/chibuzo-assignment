class MultiplicationTable {
    static main() {
        let result = 0;

        for (let counter = 1; counter <= 12; counter++) {
            for (let count = 1; count <= 12; count++) {
                result = counter * count;
                console.log(${count} x ${counter} = ${result}\t);
            }
            console.log("\n");
        }
    }
}

MultiplicationTable.main();