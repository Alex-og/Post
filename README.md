# Post
Task from stepik.org

It is necessary to describe a set of classes, each of which is a MailService:

1) UntrustworthyMailWorker - a class that simulates an unreliable mail worker, which, instead of passing the mail object 
directly to the mail service, sequentially passes this object to a set of third parties, and then, in the end, passes the 
resulting object directly to the RealMailService instance. UntrustworthyMailWorker must have a constructor from the MailService 
array (the result of calling processMail of the first element of the array is passed to the input of processMail of the second element, 
etc.) and the getRealMailService method, which returns a reference to the internal instance of RealMailService.

2) Spy - a spy who logs about all the mail correspondence that goes through his hands. The object is constructed from a Logger instance, 
with which the spy will report all actions. It monitors only objects of the MailMessage class and writes the following messages to the 
logger (in expressions, replace the parts in curly brackets with the values ​​of the mail fields):
2.1) If "Austin Powers" is specified as the sender or recipient, then you need to write a message with the WARN level to the log: 
Detected target mail correspondence: from {from} to {to} "{message}"
2.2) Otherwise, you need to write a message to the log with the INFO level: Usual correspondence: from {from} to {to}

3) Thief - a thief who steals the most valuable premises and ignores everything else. The thief takes an int variable in the constructor - 
the minimum cost of the package that he will steal. Also, the getStolenValue method must be present in this class, which returns the 
total cost of all the packages that he stole. Theft takes place as follows: instead of the parcel that came to the thief, he gives a new 
one, the same one, only with zero value and the contents of the "stones instead of {content}" parcel.

4) Inspector - An inspector who monitors banned and stolen parcels and sounds the alarm as an exception if such a parcel is found. 
If he noticed a forbidden parcel with one of the forbidden contents ("weapons" and "banned substance"), then he throws an 
IllegalPackageException. If he finds a package consisting of stones (contains the word "stones"), then the alarm will sound as a 
StolenPackageException. You must declare both exceptions yourself as unchecked exceptions.
