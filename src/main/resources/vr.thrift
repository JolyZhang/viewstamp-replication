namespace java vr.thrift
typedef i64 long
typedef i32 int


enum LogStatus{
	prepare, 
	prepared,
	failed,
	commited
}

enum ReplicaStatus{
	normal,
	view_change,
	recovering
}

struct Log{
	1: int opNumber;
	2: int viewNumber;
	3: string operation;
	4: list<LogStatus> logStatuses;	
}



struct ClientRequest{
	1: RequestParameter requestParameter;
    2: int viewNumber;
    3: RequestResponseCode requestResponseCode;
    4: string output;
} 


enum RequestResponseCode {
	redirected,
	accepted,
    completed,
    failed 
}  

struct RequestRedirect{
	1: int primaryReplica; 
}
struct RequestAccept{
	1: string responseString;
}

struct RequestSuccess{
	1: long requestNumber;
	2: string responseString;
}
struct RequestFailure{
	1: long requestNumber;
	2: string responseString;
}

union RequestUnion{
	1: RequestRedirect requestRedirect;
	2: RequestAccept requestAccept;
	3: RequestSuccess requestSuccess;
	4: RequestFailure requestFailure;
}
/* ---------------- Service Parameters and return objects-----------------
* RPC Reqest
*/
struct RequestParameter{
	1: string operation; 
    2: string clientId; 
    3: long requestNumber;
    4: int retryCount = 0;
    5: int replicaNumber;
}
struct RequestResponse {
	1: int viewNumber;
    2: RequestResponseCode requestResponseCode;
    3: RequestUnion requestUnion;   
    
}
/*--------------
* RPC Prepare
*/
struct PrepareParameter{
	1: int viewNumber; 
	2: RequestParameter message; 
	3: int opNumber;
	4: int commitNumber;
	5: int replicaNumber;
	6: int retryCount= 0;
}
struct PrepareResponse{
	1: bool prepareOk;
	2: bool commitOk;
}
/*-------------
* RPC Commit
*/
struct CommitParameter{
	1: int viewNumber; 
	2: int commitNumber;
	3: int retryCount = 0;
}
struct CommitResponse{
	1: bool commitOk;
}
/*-------------
* RPC StartViewChange
*/
struct StartViewChangeParameter{
	1: int newViewNumber;
	2: int replicaNumber;
}
struct StartViewChangeResponse{
	 
}
/*
*
*/
struct DoViewChangeParameter{
	1: int newViewNumber; 
	2: map<int,Log> logs;
	3: int oldViewNumber;
	4: int checkPoint; 
	5: int opNumber;
	6: int commitNumber; 
	7: int replicaNumber;
	8: int retryCount =0;
}
struct DoViewChangeResponse{
	1: int replicaNumber; 
	2: int newViewNumber;
	3: bool success; 

}

/*
* RPC StartView
*/
struct StartViewParameter{
	1: int viewNumber;
	2: map<int,Log> logs; 
	3: int checkPoint;
	4: int opNumber;
	5: int commitNumber;
	6: int replicaNumber;
	7: int retryCount =0;
}
struct StartViewResponse{
	1: int replicaNumber;
	2: int newViewNumber;
	3: bool success; 
}
/*
* RPC Recovery
*/
struct RecoveryParameter{
	1: int replicaNumber; 
	2: byte nonce;
	3: int retryCount =0;
}
struct RecoveryResponse{
	1: int viewNumber; 
	2: map<int,Log> logs;
	3: byte nonce;
	4: int checkPoint; 
	5: int opNumber;
	6: int commitNumber; 
	7: int replicaNumber;
}
/*
* RPC GetState
*/
struct GetStateParameter{
	1: int viewNumber;
	2: int opNumber;
	3: int replicaNumber;
	4: int retryCount =0;
}
struct GetStateResponse{
	1: int viewNumber;
	2: map<int,Log> logs;
	3: int checkPoint; 
	4: int opNumber;
	5: int commitNumber; 
}

service VRCodeService{
        RequestResponse rpcRequest(1: RequestParameter requestParameter),
        						
		PrepareResponse rpcPrepare (1: PrepareParameter prepareParameter),
									
		CommitResponse rpcCommit(1: CommitParameter commitParameter),
		
		StartViewChangeResponse rpcStartViewChange(1: StartViewChangeParameter startViewChangeParameter),
								
		DoViewChangeResponse rpcDoViewChange(1: DoViewChangeParameter doViewChangeParameter),
							
		StartViewResponse rpcStartView(1: StartViewParameter startViewParameter),
		
  		RecoveryResponse rpcRecovery(1: RecoveryParameter recoveryParameter),
			
		GetStateResponse rpcGetState(1: GetStateParameter getStateParameter)
}
