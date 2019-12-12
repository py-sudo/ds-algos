# What is recursion ?
```search(root,valueToSearch){
    if(root equals null) return null
else if(root.value equals valueToSearch) return root
else if(valueToSearch < root.value) search(root.left,valueToSearch)
else search(root.right,valueToSearch)
}```



# Properties of recursion

* same operation is performed multiple times
* in every step prople gets smaller
* base condition is a must for terminating the recursion


