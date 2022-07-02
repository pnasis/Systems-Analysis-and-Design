# System-Analysis-and-Design

Αυτό το project έγινε στα πλαίσια του μαθήματος **"Ανάλυση και Σχεδίαση Συστημάτων"**, μάθημα της κατεύθυνσης **Πληροφοριακών Συστημάτων** 4ου εξαμήνου. \
Μας ζητήθηκε να υλοποιήσουμε ένα σύστημα για την ΕΗΔΕ (Επιτροπή Ηθικής και Δεοντολογίας της Έρευνας) του πανεπιστημίου Μακεδονίας. Σκοπός αυτού του έργου είναι να επιταχύνει και να αυτοματοποιήσει (όσο γίνεται) τις επιχειρηματικές διαδικασίες. Μας ζητήθηκε να κάνουμε μια υλοποίηση του προγράμματος σε αντικειμενοστραφή προσέγγιση και συγκεκριμένα σε JAVA. Λόγω όμως του ότι μας ζητήθηκε να μην χρησιμοποιήσουμε οθόνες και βάση δεδομένων, το σύστημα παρουσιάζει κάποιες ελλείψεις. Η δυνατότητα προσωρινής αποθήκευσης της αίτησης δεν υλοποιήθηκε καθώς το πρόγραμμα μας είναι stateless και μόλις τερματίσει χάνονται όλα τα δεδομένα. Επιπλέον κάποιες δυνατότητες όπως ανάθεση εισηγητή και τακτικών μελών γίνονται by default μέσα στη main και δεν δίνεται δυνατότητα επιλογής στο χρήστη, ώστε να κρατηθεί η πολυπλοκότητα υλοποίησης του συστήματος σε ένα χαμηλό επίπεδο. Επιπλεόν η δυνατότητα εξαγωγής της αίτησης σε pdf δεν είναι διαθέσιμη καθώς δεν προσφέρεται αυτή η δυνατότητα "άμεσα" στη JAVA. Τέλος δεν υλοποιήθηκε η σύγκρουση συμφερόντων καθώς με βάση την υλοποίηση που κάναμε δεν χρειαζόταν.

Παρόλα αυτά ο χρήστης έχει τις εξής δυνατότητες τρέχοντας το πρόγραμμα:
1) Δυνατότητα υποβολής της αίτησης ως καθηγητής
2) Αξιολόγηση μιας αίτησης με βάση τον αριθμό πρωτοκόλλου
3) Εξαγωγή της αίτησης (printData)
3) Τερματισμός προγράμματος

Κατά την Υποβολή μιας αίτησης, ζητείται από τον αιτούντα καθηγητή να καταχωρήσει το ονοματεπώνυμο του, το τμήμα στο οποίο ανήκει, το τίτλο της εργασίας του και αν έχει καταχωρήσει τα απαραίτητα έγγραφα. (**Υ.Σ.** στο Class Diagram φαίνεται πως τα docs είναι τύπου file, καθώς στην  κανονική υλοποίηση του συστήματος ο χρήστης θα επισυνάπτει αρχεία. Για χάρην ευκολίας και επειδή δεν επρόκειτο να γίνει έλεγχος των αρχείων, θεωρούμαι πως ένα yes/no είναι αρκετό). Αν ο χρήστης καταχωρήσει no στα docs, τότε λαμβάνει μήνυμα πως η αίτηση του δεν είναι έγκυρη και η αίτηση δεν καταχωρείται. Αν όμως στο πεδίο docs καταχωρήσει yes, τότε ο χρήστης λαμβάνει μήνυμα για τη επιτυχή καταχώρηση της αίτησης του, τον αριθμό πρωτοκόλλου και ενημερώνεται για την τρέχουσα κατάσταση της αίτησης του ('Submitted'). \
\
Κατά την διαδικασία της αξιολόγησης μιας αίτησης ζητείται από το χρήστη να καταχωρήσει τον αριθμό πρωτοκόλλου της αίτησης για την οποία θέλει να γίνει αξιολόγηση. Στη συνέχεια ζητείται από το πρόεδρο να υπογράψει την αίτηση ώστε να ξεκινήσειη διαδικασία της αξιολόγησης. Η γραμματεία ενημερώνει την κτάσταση της αίτησης ως 'Υπο επεξεργασία' ('Under Evaluation'). Έπειτα ζητείται από τον εισηγητή να κάνει την εισήγηση και να αξιολογήσει την αίτηση. Κατόπιν ζητείται από τα 4 τακτικά μέλη να αξιολογήσουν την αίτηση. Ανάλογα με το αν η πλειοψηφία είναι θέτικη ή αρνητική βγαίνει το τελικό αποτέλεσμα και η αίτηση αξιολογείται ως Εγκεκριμένη ή Απορρίπτεται και ο αιτών ενημερώνεται για τη τελική απόφαση. \
\
Κατά την "εξαγωγή" της αίτησης, καλείται η μέθοδος printData όπου και ζητούνταν μέσα στη οδηγίες του εγγραάφου για τη τελική υποβολή της εργασίας. Εμφανίζονται στη κονσόλα το όνομα του αιτούντα, το τμήμα στο οποίο ανήκει, ο τίτλός της εργασίας, ημερομηνία, αν έχει επισυνάψει τα απαραίτητα έγγραφα και η τρέχουσα κατάσταση της αίτησης. \
\
Τέλος, ο χρήστης μπορεί να επιλέξει να τερματίσει το πρόγραμμα.
